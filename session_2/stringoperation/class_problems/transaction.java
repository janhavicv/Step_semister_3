class transaction {
    String normalizeReference(String raw) {
        raw = raw.trim();
        String bankCode = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);
        return bankCode + remaining;
    }
    String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }
        for (int i = 3; i < 14; i++) {

            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }
        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9, 14);
        StringBuilder formattedDate = new StringBuilder(date);
        formattedDate.insert(2, "/");
        formattedDate.insert(5, "/");
        StringBuilder result = new StringBuilder();

        result.append("[");
        result.append(bankCode);
        result.append("] DATE: ");
        result.append(formattedDate);
        result.append(" | SEQ: ");
        result.append(sequence);
        return result.toString();
    }

    public static void main(String[] args) {
        transaction t = new transaction();
        String raw = " hdf03022600042 ";
        String normalized = t.normalizeReference(raw);
        System.out.println(t.validateAndFormat(normalized));
    }
}
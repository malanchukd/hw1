package delegation;

public enum Film implements FilmType {
    NEW_FILM {
        @Override
        public int getPrice(int days) {
            return days * 3;
        }
        @Override
        public int getBonus(int days){return NEWFILM_RATE * days;}
    },
    CHILDREN_FILM {
        @Override
        public int getPrice(int days) {
            return days;
        }
        @Override
        public int getBonus(int days){return CHILDREN_RATE * days;}
    },
    REGULAR_FILM {
        @Override
        public int getPrice(int days) {
            return days * 2;
        }
        @Override
        public int getBonus(int days){return days;}
    };

    private static final int NEWFILM_RATE = 10;

    private static final int CHILDREN_RATE = 15;

}



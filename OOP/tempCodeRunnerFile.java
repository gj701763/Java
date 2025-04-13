) {
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);//returns a random number in the specified range
        return randomNumber;
package com.airtribe.learntrack;
class EntityNotFoundException extends Exception {

    public EntityNotFoundException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {

    public InvalidInputException(String message) {
        super(message);
    }
}
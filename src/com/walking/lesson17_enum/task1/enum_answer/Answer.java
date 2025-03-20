package com.walking.lesson17_enum.task1.enum_answer;

public enum Answer {
    Hello("Hello"), Buy("Good bye"), Howareyou("How are your doing"), Unknown("Unknown message");

    private final String answer;

    Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}

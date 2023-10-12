public class Answer {
    int bull;
    int cow;
    int maxTry;

    public Answer(int bull, int cow, int maxTry) {
        this.bull = bull;
        this.cow = cow;
        this.maxTry = maxTry;
    }

    @Override
    public String toString() {
        return "Статистика: " +
                "быки=" + bull +
                ", коровы=" + cow +
                ", оставшееся количество попыток=" + maxTry;
    }
}

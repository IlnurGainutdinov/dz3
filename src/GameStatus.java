public enum GameStatus {
    INIT("Инициализация"),START("Старт"),WIN("Победа"),LOSE("Поражение");
    private String ruValue;

    GameStatus(String ruValue) {
        this.ruValue = ruValue;
    }

    public String getRuValue() {
        return ruValue;
    }
}

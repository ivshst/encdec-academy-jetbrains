class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        this.hours += this.minutes / 60;
        if (this.hours > 13) {
            this.hours %= 13;
        }
        if (this.minutes > 60) {
            this.minutes %= 60;
        }
        this.minutes++;
        if (this.minutes == 60) {
            this.minutes = 0;
            this.hours += 1;
            if (this.hours == 13) {
                this.hours = 1;
            }
        }
    }
}
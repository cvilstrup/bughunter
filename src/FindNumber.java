/* Find fejlen i koden (klaret) */

void main() {
    int[] numbers = {4, 8, 15, 16, 23, 42};
    int target = 15;

    for (int number : numbers) {
        if (number != target) {
            IO.println("Not found");
        } else {
            IO.println("Found");
        }
    }
}

    public void testSum() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(10, np._sum(numbers));
    }
    @Test
    public void testMult() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(24, np._mult(numbers));
    }
    @Test
    public void testraboti() {
        int[] largeNumbers = new int[1_000_000];
        Arrays.fill(largeNumbers, 1);

        long startTime = System.nanoTime();
        np._min(largeNumbers);
        long endTime = System.nanoTime();
        System.out.println("Min время исполнения " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        np._max(largeNumbers);
        endTime = System.nanoTime();
        System.out.println("Max время исполнения " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        np._sum(largeNumbers);
        endTime = System.nanoTime();
        System.out.println("Sum время исполнения " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        np._mult(largeNumbers);
        endTime = System.nanoTime();
        System.out.println("Mult время исполнения " + (endTime - startTime) + " нс");
    }
    @Test
    public void tst() {
        int[] numbers = {-1, -4, -2, -3};
        assertEquals(-4, np._min(numbers));
        assertEquals(-1, np._max(numbers));
        assertEquals(-10, np._sum(numbers));
        assertEquals(-24, np._mult(numbers));
    }
}

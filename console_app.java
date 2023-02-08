package CS_102_PROJECT;


public class console_app {
    public static void main(String[] args) {

    }

    public static int[] array_maker(int array_size) {

        int[] rand_int_array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            rand_int_array[i] = 0 + (int)(Math.random() * ((100 - 0) + 1));
        }

        return rand_int_array;
    }
}
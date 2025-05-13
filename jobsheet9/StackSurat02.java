package jobsheet9;

public class StackSurat02 {
    Surat02[] stack;
    int size;
    int top;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }
    
    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin yang dapat diproses.");
            return null;
        }
    }
    
    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }
    
    public boolean search(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}

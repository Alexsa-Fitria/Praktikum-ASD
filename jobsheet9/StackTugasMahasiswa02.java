package jobsheet9;

public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top;
    int size;

    public int jmlTugas(){ 
        return top + 1; 
    } 

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa02 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    
    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa02 peek(){ 
        if (!isEmpty()){ 
            return stack[0]; 
        }else { 
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan"); 
            return null; 
        } 
    } 

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
            System.out.println("");
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi02 stack = new StackKonversi02();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

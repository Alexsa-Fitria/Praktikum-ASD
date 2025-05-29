package jobsheet11;

public class MahasiswaQueue02 {
    NodeMahasiswa02 front, rear;
    int size, maxsize;

    public MahasiswaQueue02(int max) {
        front = rear = null;
        maxsize = max;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxsize;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dibersihkan!");
    }

    public void enqueue(MahasiswaData02 student) {
        if (isFull()) {
            System.out.println("Antrian Penuh!");
            return;
        }
        NodeMahasiswa02 newNode = new NodeMahasiswa02(student);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa ditambahkan ke antrian.");
    }

    public MahasiswaData02 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        MahasiswaData02 data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        size--;
        return data;
    }

    public void displayFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Mahasiswa di depan:");
        front.data.print();
    }

    public void displayRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Mahasiswa di belakang:");
        rear.data.print();
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        NodeMahasiswa02 temp = front;
        System.out.println("----- Semua Mahasiswa dalam Antrian -----");
        while (temp != null) {
            temp.data.print();
            System.out.println("------------------------------");
            temp = temp.next;
        }
    }

    public int getSize() {
        return size;
    }
}

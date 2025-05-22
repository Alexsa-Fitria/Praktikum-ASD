package P2jobsheet10;

public class StudentKRSQueue {
    StudentKRS[] data;
    int front, rear, size, max;
    int approvedCount = 0;
    int max_students = 30;

    public StudentKRSQueue(int n) {
        max = n;
        data = new StudentKRS[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(StudentKRS dt) {
        if (isFull()) {
            System.out.println("Antrian penuh!!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s berhasil ditambahkan pada indeks %d\n", dt.name, rear);
    }
    //

    void dequeue2() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            for (int i = 0; i < 2; i++) {
                if (!isEmpty()) {
                    System.out.println("Memproses mahasiswa:");
                    data[front].print();
                    front = (front + 1) % max;
                    size--;
                    approvedCount++;
                } else {
                    System.out.println("Tidak ada lagi mahasiswa dalam antrian.");
                    break;
                }
            }
        }
    }

    void printApprovedCount() {
        System.out.println("Total mahasiswa yang disetujui: " + approvedCount);
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Data terdepan: ");
            data[front].print();
        } else {
            System.out.println("Antrian kosong!!!");
        }
    }

    void peek2() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            if (size == 1) {
                System.out.println("Data terdepan: ");
                data[front].print();
            } else {
                int temp = front;
                System.out.println("Data terdepan: ");
                data[front].print();

                temp = (temp + 1) % max;
                System.out.println("Data terdepan ke-2: ");
                data[temp].print();
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!!!");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Jumlah Elemen: " + size);
    }

    public void clear() {
        if (isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Semua data berhasil dihapus");
        } else {
            System.out.println("Antrian sudah kosong!!");
        }
    }

    public void viewRear() {
        if (!isEmpty()) {
            System.out.println("Data terakhir: ");
            data[rear].print();
        } else {
            System.out.println("Antrian kosong!!");

        }
    }

    public void printRemainingStudent() {
        int remaining = max_students - approvedCount;
        System.out.println("Mahasiswa yang belum disetujui: " + remaining);
    }
}
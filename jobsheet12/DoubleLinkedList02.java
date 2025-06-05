package jobsheet12;

public class DoubleLinkedList02 {
    Node02 head;
    Node02 tail;
    int size;

    public DoubleLinkedList02() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
    
        // Cari node dengan NIM = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
    
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
    
        Node02 newNode = new Node02(data);
    
        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        } else {
            Node02 current = head;
            System.out.println("Isi Double Linked List:");
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
        } else {
            Mahasiswa02 dataDihapus = head.data; // Mengganti Mahasiswa04 menjadi Mahasiswa02
            if (head == tail) {
                head = tail = null; // Jika hanya ada satu elemen
            } else {
                head = head.next; // Pindahkan head ke node berikutnya
                head.prev = null; // Set prev dari head baru ke null
            }
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
            dataDihapus.tampil(); // Tampilkan data yang dihapus
        }
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    
    public Node02 search(String nim) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dicari.");
            return null;
        }
        Node02 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null; // Jika tidak ditemukan
    }
    public void add(int index, Mahasiswa02 data) {
        if (index < 0 || index > size) { 
            System.out.println("Indeks salah, tidak bisa menambahkan data.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node02 newNode = new Node02(data);
            Node02 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
            size++; 
        }
    }
    public void removeAfter(String keyNim) {
        Node02 current = search(keyNim); 
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }
        Node02 toRemove = current.next;
        if (toRemove == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toRemove.next;
            toRemove.next.prev = current;
        }
        size--; 
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        toRemove.data.tampil();
    }
    public void remove(int index) {
        if (index < 0 || index >= size) { 
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            removeFirst(); 
        } else if (index == size - 1) {
            removeLast(); 
        } else {
            Node02 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--; 
            System.out.println("Data berhasil dihapus pada indeks " + index + ":");
            current.data.tampil();
        }
    }
    // getFirst()
    public Mahasiswa02 getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }
    // getLast() (untuk node tail):
    public Mahasiswa02 getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.data;
    }

    // get() (untuk node pada indeks tertentu):
    public Mahasiswa02 get(int index) {
        if (index < 0 || index >= size) { 
            return null; 
        }
        Node02 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public class DoubleLinkedLists02 {
        Node02 head;
        Node02 tail;
        int size; 
    public DoubleLinkedLists02() {
        head = null;
        tail = null;
        size = 0; 
    }

    // Fungsi size() untuk mengembalikan nilai size:
    public int size() {
        return size; 
    }
}
}

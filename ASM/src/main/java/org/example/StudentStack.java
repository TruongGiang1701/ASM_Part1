package org.example;

class StudentStack {
    private Node top;  // Đỉnh của stack
    private int size;

    public StudentStack() {
        this.top = null;
        this.size = 0;
    }

    // Thêm sinh viên vào stack
    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Lấy sinh viên ra khỏi stack
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No students to remove.");
            return null;
        }
        Student poppedStudent = top.student;
        top = top.next;
        size--;
        return poppedStudent;
    }

    // Xem sinh viên đầu của stack mà không xóa
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.student;
    }

    // Kiểm tra stack rỗng
    public boolean isEmpty() {
        return top == null;
    }

    // Hiển thị các sinh viên trong stack
    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students in the stack.");
            return;
        }

        System.out.println("Students in Stack:");
        Node current = top;
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
    public int size() {
        return size;
    }
}

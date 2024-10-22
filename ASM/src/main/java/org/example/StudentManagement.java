package org.example;

class StudentManagement {
    private StudentStack students;

    public StudentManagement() {
        this.students = new StudentStack();
    }
    // Thêm sinh viên vào stack
    public void addStudent(Student student) {
        students.push(student);
        System.out.println("Added: " + student);
    }

    // Cập nhật thông tin sinh viên theo ID
    public void updateStudent(String id, String newName, double newMarks) {
        StudentStack tempStack = new StudentStack();
        boolean found = false;

        while (!students.isEmpty()) {
            Student student = students.pop();
            if (student.getId().equals(id)) {
                student.setName(newName);
                student.setMarks(newMarks);
                found = true;
            }
            tempStack.push(student);
        }

        // Khôi phục lại stack ban đầu
        while (!tempStack.isEmpty()) {
            students.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        } else {
            System.out.println("Student with ID " + id + " has been updated.");
        }
    }

    // Tìm kiếm sinh viên theo ID
    public Student searchStudent(String id) {
        StudentStack tempStack = new StudentStack();
        Student foundStudent = null;

        while (!students.isEmpty()) {
            Student student = students.pop();
            if (student.getId().equals(id)) {
                foundStudent = student;
            }
            tempStack.push(student);
        }

        // Khôi phục lại stack ban đầu
        while (!tempStack.isEmpty()) {
            students.push(tempStack.pop());
        }

        if (foundStudent == null) {
            System.out.println("Student with ID " + id + " not found.");
        }
        return foundStudent;
    }

    // Xóa sinh viên theo ID
    public void deleteStudent(String id) {
        StudentStack tempStack = new StudentStack();
        boolean found = false;

        while (!students.isEmpty()) {
            Student student = students.pop();
            if (!student.getId().equals(id)) {
                tempStack.push(student);
            } else {
                found = true;
            }
        }

        // Khôi phục lại stack ban đầu
        while (!tempStack.isEmpty()) {
            students.push(tempStack.pop());
        }

        if (found) {
            System.out.println("Deleted student with ID " + id);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Hiển thị tất cả sinh viên
    public void displayStudents() {
        students.displayStudents();
    }
}

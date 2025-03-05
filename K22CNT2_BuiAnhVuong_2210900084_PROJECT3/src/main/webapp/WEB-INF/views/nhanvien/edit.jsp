<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh sửa nhân viên</title>
    <style>
        /* Reset mặc định */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        body {
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
        }

        h2 {
            color: #333;
            margin-bottom: 20px;
        }

        form {
            display: flex;
            flex-direction: column;
            text-align: left;
        }

        label {
            font-weight: bold;
            margin-top: 10px;
        }

        input[type="text"],
        input[type="email"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            margin-top: 15px;
            background-color: #28a745;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }

        .back-link {
            display: block;
            margin-top: 15px;
            color: #007bff;
            text-decoration: none;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Chỉnh sửa nhân viên</h2>
        <form action="../update" method="post">
            <input type="hidden" name="id" value="${command.id}">

            <label for="bav_name">Tên:</label>
            <input type="text" id="bav_name" name="bav_name" value="${command.bav_name}" required>

            <label for="bav_hinhanh">Hình ảnh URL:</label>
            <input type="text" id="bav_hinhanh" name="bav_hinhanh" value="${command.bav_hinhanh}">

            <label for="bav_tuoi">Tuổi:</label>
            <input type="number" id="bav_tuoi" name="bav_tuoi" value="${command.bav_tuoi}" required>

            <label for="bav_diachi">Địa chỉ:</label>
            <input type="text" id="bav_diachi" name="bav_diachi" value="${command.bav_diachi}" required>

            <label for="bav_email">Email:</label>
            <input type="email" id="bav_email" name="bav_email" value="${command.bav_email}" required>

            <label for="bav_soluong">Số lượng:</label>
            <input type="number" id="bav_soluong" name="bav_soluong" value="${command.bav_soluong}" required>

            <input type="submit" value="Cập nhật">
        </form>

        <a href="../list" class="back-link">Quay lại danh sách</a>
    </div>
</body>
</html>

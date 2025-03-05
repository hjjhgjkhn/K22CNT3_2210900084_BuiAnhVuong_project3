<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Thêm Nhân Viên</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        input[type="text"], input[type="number"], input[type="email"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background: #28a745;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s;
        }

        input[type="submit"]:hover {
            background: #218838;
        }

        a {
            display: inline-block;
            margin-top: 10px;
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Thêm Nhân Viên</h2>
        <form action="save" method="post">
            <input type="text" name="bav_name" placeholder="Tên nhân viên" required>
            <input type="text" name="bav_hinhanh" placeholder="URL Hình Ảnh" required>
            <input type="number" name="bav_tuoi" placeholder="Tuổi" required>
            <input type="text" name="bav_diachi" placeholder="Địa Chỉ" required>
            <input type="email" name="bav_email" placeholder="Email" required>
            <input type="number" name="bav_soluong" placeholder="Số Lương" required>
            <input type="submit" value="Thêm">
        </form>
        <a href="list">Quay lại danh sách</a>
    </div>
</body>
</html>

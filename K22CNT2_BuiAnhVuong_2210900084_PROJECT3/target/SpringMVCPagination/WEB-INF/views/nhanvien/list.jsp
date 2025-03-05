<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách nhân viên</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 20px;
            background: linear-gradient(to right, #ff9a9e, #fad0c4);
            color: #333;
        }
        h2 {
            text-align: center;
            color: #fff;
            background: rgba(0, 0, 0, 0.2);
            padding: 15px;
            border-radius: 10px;
        }
        .employee-list {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
            margin-top: 20px;
        }
        .employee-item {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 250px;
            transition: transform 0.3s ease-in-out;
            border: 2px solid #ff758c;
        }
        .employee-item:hover {
            transform: scale(1.05);
        }
        .employee-item img {
            width: 120px;
            height: 120px;
            border-radius: 50%;
            object-fit: cover;
            border: 4px solid #ff758c;
        }
        .actions a {
            display: inline-block;
            margin: 5px;
            padding: 7px 15px;
            text-decoration: none;
            color: white;
            border-radius: 5px;
            font-weight: bold;
            transition: background 0.3s;
        }
        .actions a:first-child {
            background-color: #2196F3;
        }
        .actions a:first-child:hover {
            background-color: #1976D2;
        }
        .actions a:last-child {
            background-color: #f44336;
        }
        .actions a:last-child:hover {
            background-color: #d32f2f;
        }
        .add-btn {
            display: block;
            width: 220px;
            text-align: center;
            margin: 20px auto;
            padding: 12px;
            background: #ff758c;
            color: white;
            text-decoration: none;
            font-weight: bold;
            border-radius: 5px;
            font-size: 18px;
            transition: background 0.3s;
        }
        .add-btn:hover {
            background: #e94e77;
        }
    </style>
</head>
<body>
    <h2>Danh sách Nhân Viên</h2>
    <div class="employee-list">
        <c:forEach var="nv" items="${list}">
            <div class="employee-item">
                <h3>${nv.bav_name}</h3>
                <img src="${nv.bav_hinhanh}" alt="Hình ảnh">
                <p><strong>Tuổi:</strong> ${nv.bav_tuoi}</p>
                <p><strong>Địa chỉ:</strong> ${nv.bav_diachi}</p>
                <p><strong>Email:</strong> ${nv.bav_email}</p>
                <p><strong>Số Lương:</strong> ${nv.bav_soluong} Vnđ</p>
                <div class="actions">
                    <a href="edit/${nv.id}">✏️ Sửa</a>
                    <a href="delete/${nv.id}" onclick="return confirm('Bạn có chắc muốn xóa?')">🗑️ Xóa</a>
                </div>
            </div>
        </c:forEach>
    </div>
    <br>
    <a href="add" class="add-btn">➕ Thêm Nhân Viên</a>
</body>
</html>

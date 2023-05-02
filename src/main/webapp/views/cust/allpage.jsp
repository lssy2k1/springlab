<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col-sm-8 text-left">
    <div class="container">
        <div class = "row-content">
            <div class="col-sm-6 text-left">
                <h3>cust All page</h3>
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>id</th>
<%--                        <th>pwd</th>--%>
                        <th>name</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="c" items="${cpage.getList()}">
                        <tr>
                            <td><a href="/cust/get?id=${c.id}">${c.id}</a></td>
<%--                            <td><a href="">${c.pwd}</a></td>--%>
                            <td><a href="">${c.name}</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <jsp:include page="../page.jsp"/>
            </div>
        </div><!-- row content end-->
    </div>
</div>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:include page="header.jsp"/>


<div class="container">
    <div class="row">
<c:forEach items= "${githubers}" var="githuber">
    <div class="col-md">
    <div class="list-group">
    <button type="button" class="list-group-item list-group-item-action active bg-dark" data-toggle="tooltip" data-placement="bottom" title=${githuber.email}>
            ${githuber.name}
    </button>
    <button type="button" class="list-group-item  list-group-item-action bg-"><img src=${githuber.avatarUrl} data-toggle="tooltip" data-placement="bottom" title= ${githuber.email}> </button>
    </div>
    </div>
</c:forEach>
    </div>
</div>





</body>
</html>


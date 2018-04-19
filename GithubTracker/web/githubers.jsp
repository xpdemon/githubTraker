<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:include page="header.jsp"/>


<div class="list-group">
    <button type="button" class="list-group-item list-group-item-action active bg-dark">
        Mes Githubers
    </button>
<c:forEach items= "${githubers}" var="githuber">
    <div>
    <button type="button" class="list-group-item  list-group-item-action bg-"><img src=${githuber.avatarUrl}> ${githuber.name}</button>
    </div>
</c:forEach>
</div>

</body>
</html>


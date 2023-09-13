<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
\<script src="${path}/resources/js/jquery-3.7.1.js"></script>
<link rel="stylesheet" href="${path}/resources/css/bulma.css" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <%-- <jsp:include page="./include/common.jsp"></jsp:include> --%>
</head>

<body>
<header>
    <jsp:include page="./include/header.jsp"></jsp:include>

</header>
<section class="hero is-warning">
    <div class="hero-body">
        <p class="title">
            Warning hero
        </p>
        <p class="subtitle">
            Warning subtitle
        </p>
    </div>
</section>
       <div class="container is-fullhd">
           <div class="notification is-primary">
               This container is <strong>fullwidth</strong> <em>until</em> the <code>$fullhd</code> breakpoint.
               <h2>티스푼 메인 페이지</h2>
               이름 : ${name}
               <hr>
               현재 : ${today}


           <ul class="list">
               <li><a href="${path}/sample/main.do">RequestMapping 방식 : Get</a></li>
               <li><a href="${path}/sample/get1.do?id=kkt&pw=1234">GetMapping 방식 : request+model</a></li>
               <li><a href="${path}/sample/get2.do?id=kkt&pw=1234">RequestMapping.GET 방식 : request+model</a></li>
               <li><a href="${path}/sample/get3.do?id=kkt&pw=1234">RequestMapping.GET 방식 : RequestParam+model</a></li>
               <li><a href="${path}/sample/get4.do?id=kkt&pw=1234">RequestMapping.GET 방식 : dto+model</a></li>
               <li><a href="${path}/sample/get5.do?id=kkt&pw=1234">RequestMapping.GET 방식 : ModelAttribute+model</a></li>
               <li><a href="${path}/sample/get6.do/kkt/1234">RequestMapping.GET 방식 : PathVariable+model</a></li>
               <li><a href="${path}/sample/get7.do?id=kkt&pw=1234">RequestMapping.GET 방식 : RequestParam+ModelAndView</a></li>
               <li><a href=""></a></li>
               <li><a href=""></a></li>
           </ul>
           </div>
       </div>
<jsp:include page="./include/footer.jsp"></jsp:include>
    </body>
</html>

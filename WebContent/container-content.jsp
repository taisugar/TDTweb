<%@page import="Entity.BaiViet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.ChuDe"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- begin container-content -->
<%
	ArrayList<ChuDe> lsTopic = (ArrayList<ChuDe>) session.getAttribute("topic");
	if (lsTopic != null) {
%>
<div class="row">
	<%
		for (ChuDe c : lsTopic) {
	%>
	<div class="col-xs-5 col-sm-2 pricing-box">
		<div class="widget-box pricing-box-small widget-color-orange">
			<div class="widget-header">
				<h5 class="widget-title bigger lighter"><%=c.getTenChude()%></h5>
			</div>

			<div class="widget-body">
				<div class="widget-main no-padding">
					<ul class="list-unstyled list-striped pricing-table">
						<li><i class="ace-icon fa fa-check green"></i> Bài Viết</li>

						<li><i class="ace-icon fa fa-check green"></i> 100 comments</li>
					</ul>
				</div>

				<div>
					<a href="CommentController?txtAction=getallpost&machude=<%=c.getMaChude() %>" class="btn btn-block btn-sm btn-warning"> <span>Xem</span>
					</a>
				</div>
			</div>
		</div>
	</div>
	<%
		}
		}
	%>
</div>
<!-- end container-content -->
<jsp:include page="footer.jsp"></jsp:include>
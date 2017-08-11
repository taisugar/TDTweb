<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- begin menu -->
<div id="sidebar" class="sidebar responsive ace-save-state">
	<script type="text/javascript">
		try{ace.settings.loadState('sidebar')}catch(e){}
	</script>

	<ul class="nav nav-list">
		<li class="active" id="home">
			<a href="#">
				<i class="menu-icon fa fa-tachometer"></i>
				<span class="menu-text"> Forum TDT </span>
			</a>

			<b class="arrow"></b>
		</li>
		
		<li class="" id="topic">
			<a href="TopicController?txtAction=getalltopic">
				<i class="menu-icon fa fa-list-alt"></i>
				<span class="menu-text"> Chủ đề </span>
			</a>

			<b class="arrow"></b>
		</li>
		
		<li class="" id="post">
			<a href="#">
				<i class="menu-icon fa fa-pencil-square-o"></i>
				<span class="menu-text"> Bài viết </span>
			</a>

			<b class="arrow"></b>
		</li>
		
		<li class="" id="date">
			<a href="#">
				<i class="menu-icon fa fa-calendar"></i>

				<span class="menu-text">
					Calendar

					<span class="badge badge-transparent tooltip-error" title="2 Important Events">
						<i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i>
					</span>
				</span>
			</a>

			<b class="arrow"></b>
		</li>

		<li class="">
			<a href="#">
				<i class="menu-icon fa fa-tag"></i>
				<span class="menu-text"> About </span>
			</a>

			<b class="arrow"></b>
		</li>
	</ul><!-- /.nav-list -->

	<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
		<i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
	</div>
</div>
<!-- end menu -->
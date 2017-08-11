<%@page import="Entity.TaiKhoan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	TaiKhoan acc = (TaiKhoan) session.getAttribute("TaiKhoan");
	if (acc != null) {
		
%>
<!-- begin profile -->
<div class="page-header">
	<h1>User Profile Page</h1>
</div>
<!-- /.page-header -->
<div class="row">
	<div class="col-xs-12">
		<!-- PAGE CONTENT BEGINS -->
		<div id="user-profile-1" class="user-profile row">
			<div class="col-xs-12 col-sm-3 center">
				<div>
					<span class="profile-picture"> <img id="avatar"
						class="editable img-responsive" alt="Alex's Avatar"
						src="assets/images/avatars/profile-pic.jpg" />
					</span>

					<div class="space-4"></div>

					<div
						class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
						<div class="inline position-relative">
							<a href="#" class="user-title-label dropdown-toggle"
								data-toggle="dropdown"> <i
								class="ace-icon fa fa-circle light-green"></i> &nbsp; <span
								class="white"><%=acc.getUsername() %></span>
							</a>
						</div>
					</div>
				</div>

				<div class="space-6"></div>

				

				<div class="hr hr12 dotted"></div>

				<div class="clearfix">
					<div class="grid2">
						<span class="bigger-175 blue">25</span> <br /> Followers
					</div>

					<div class="grid2">
						<span class="bigger-175 blue">12</span> <br /> Following
					</div>
				</div>

				<div class="hr hr16 dotted"></div>
			</div>

			<div class="col-xs-12 col-sm-9">
				<div class="center">
					<span class="btn btn-app btn-sm btn-light no-hover"> <span
						class="line-height-1 bigger-170 blue"> 1,411 </span> <br /> <span
						class="line-height-1 smaller-90"> Views </span>
					</span> <span class="btn btn-app btn-sm btn-grey no-hover"> <span
						class="line-height-1 bigger-170"> 23 </span> <br /> <span
						class="line-height-1 smaller-90"> Comment </span>
					</span> <span class="btn btn-app btn-sm btn-success no-hover"> <span
						class="line-height-1 bigger-170"> 7 </span> <br /> <span
						class="line-height-1 smaller-90"> Post </span>
					</span>
				</div>

				<div class="space-12"></div>

				<div class="profile-user-info profile-user-info-striped">
					<div class="profile-info-row">
						<div class="profile-info-name">Username</div>

						<div class="profile-info-value">
							<span class="editable" id="username"><%=acc.getThanhVien().getTenThanhVien() %></span>
						</div>
					</div>

					<div class="profile-info-row">
						<div class="profile-info-name">Position</div>

						<div class="profile-info-value"><span class="editable" id="position"><%if(acc.getPosition() == 1){ %>User<%} %></span>
						</div>
					</div>

					<div class="profile-info-row">
						<div class="profile-info-name">Joined</div>

						<div class="profile-info-value">
							<span class="editable" id="signup">2017/04/30</span>
						</div>
					</div>

					<div class="profile-info-row">
						<div class="profile-info-name">Last Online</div>

						<div class="profile-info-value">
							<span class="editable" id="login">3 hours ago</span>
						</div>
					</div>

					<div class="profile-info-row">
						<div class="profile-info-name">About Me</div>

						<div class="profile-info-value">
							<span class="editable" id="about"></span>
						</div>
					</div>
				</div>

				<div class="space-20"></div>

				<div class="widget-box transparent">
					<div class="widget-header widget-header-small">
						<h4 class="widget-title blue smaller">
							<i class="ace-icon fa fa-rss orange"></i> Recent Activities
						</h4>

						<div class="widget-toolbar action-buttons">
							<a href="#" data-action="reload"> <i
								class="ace-icon fa fa-refresh blue"></i>
							</a> &nbsp; <a href="#" class="pink"> <i
								class="ace-icon fa fa-trash-o"></i>
							</a>
						</div>
					</div>

					<div class="widget-body">
						<div class="widget-main padding-8">
							<div id="profile-feed-1" class="profile-feed">
								<div class="profile-activity clearfix">
									<div>
										<img class="pull-left" alt="Alex Doe's avatar"
											src="assets/images/avatars/avatar5.png" /> <a class="user"
											href="#"> Alex Doe </a> changed his profile photo. <a
											href="#">Take a look</a>

										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> an hour ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<img class="pull-left" alt="Susan Smith's avatar"
											src="assets/images/avatars/avatar1.png" /> <a class="user"
											href="#"> Susan Smith </a> is now friends with Alex Doe.
										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 2 hours ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<i
											class="pull-left thumbicon fa fa-check btn-success no-hover"></i>
										<a class="user" href="#"> Alex Doe </a> joined <a href="#">Country
											Music</a> group.
										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 5 hours ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<i
											class="pull-left thumbicon fa fa-picture-o btn-info no-hover"></i>
										<a class="user" href="#"> Alex Doe </a> uploaded a new photo.
										<a href="#">Take a look</a>

										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 5 hours ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<img class="pull-left" alt="David Palms's avatar"
											src="assets/images/avatars/avatar4.png" /> <a class="user"
											href="#"> David Palms </a> left a comment on Alex's wall.
										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 8 hours ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<i
											class="pull-left thumbicon fa fa-pencil-square-o btn-pink no-hover"></i>
										<a class="user" href="#"> Alex Doe </a> published a new blog
										post. <a href="#">Read now</a>

										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 11 hours
											ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<img class="pull-left" alt="Alex Doe's avatar"
											src="assets/images/avatars/avatar5.png" /> <a class="user"
											href="#"> Alex Doe </a> upgraded his skills.
										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 12 hours
											ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<i class="pull-left thumbicon fa fa-key btn-info no-hover"></i>
										<a class="user" href="#"> Alex Doe </a> logged in.
										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 12 hours
											ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<i
											class="pull-left thumbicon fa fa-power-off btn-inverse no-hover"></i>
										<a class="user" href="#"> Alex Doe </a> logged out.
										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 16 hours
											ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>

								<div class="profile-activity clearfix">
									<div>
										<i class="pull-left thumbicon fa fa-key btn-info no-hover"></i>
										<a class="user" href="#"> Alex Doe </a> logged in.
										<div class="time">
											<i class="ace-icon fa fa-clock-o bigger-110"></i> 16 hours
											ago
										</div>
									</div>

									<div class="tools action-buttons">
										<a href="#" class="blue"> <i
											class="ace-icon fa fa-pencil bigger-125"></i>
										</a> <a href="#" class="red"> <i
											class="ace-icon fa fa-times bigger-125"></i>
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="hr hr2 hr-double"></div>

				<div class="space-6"></div>

				<div class="center">
					<button type="button"
						class="btn btn-sm btn-primary btn-white btn-round">
						<i class="ace-icon fa fa-rss bigger-150 middle orange2"></i> <span
							class="bigger-110">View more activities</span> <i
							class="icon-on-right ace-icon fa fa-arrow-right"></i>
					</button>
				</div>
			</div>
		</div>
		<!-- PAGE CONTENT ENDS -->
	</div>
	<!-- /.col -->
</div>
<!-- /.row -->
<!-- end profile -->
<jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript">
	jQuery(function($) {
		//editables on first profile page
		$.fn.editable.defaults.mode = 'inline';
		$.fn.editableform.loading = "<div class='editableform-loading'><i class='ace-icon fa fa-spinner fa-spin fa-2x light-blue'></i></div>";
		$.fn.editableform.buttons = '<button type="submit" class="btn btn-info editable-submit"><i class="ace-icon fa fa-check"></i></button>'
				+ '<button type="button" class="btn editable-cancel"><i class="ace-icon fa fa-times"></i></button>';

		// *** editable avatar *** //
		try {//ie8 throws some harmless exceptions, so let's catch'em

			//first let's add a fake appendChild method for Image element for browsers that have a problem with this
			//because editable plugin calls appendChild, and it causes errors on IE at unpredicted points
			try {
				document.createElement('IMG').appendChild(
						document.createElement('B'));
			} catch (e) {
				Image.prototype.appendChild = function(el) {
				}
			}

			var last_gritter
			$('#avatar')
					.editable(
							{
								type : 'image',
								name : 'avatar',
								value : null,
								//onblur: 'ignore',  //don't reset or hide editable onblur?!
								image : {
									//specify ace file input plugin's options here
									btn_choose : 'Change Avatar',
									droppable : true,
									maxSize : 110000,//~100Kb

									//and a few extra ones here
									name : 'avatar',//put the field name here as well, will be used inside the custom plugin
									on_error : function(error_type) {//on_error function will be called when the selected file has a problem
										if (last_gritter)
											$.gritter.remove(last_gritter);
										if (error_type == 1) {//file format error
											last_gritter = $.gritter
													.add({
														title : 'File is not an image!',
														text : 'Please choose a jpg|gif|png image!',
														class_name : 'gritter-error gritter-center'
													});
										} else if (error_type == 2) {//file size rror
											last_gritter = $.gritter
													.add({
														title : 'File too big!',
														text : 'Image size should not exceed 100Kb!',
														class_name : 'gritter-error gritter-center'
													});
										} else {//other error
										}
									},
									on_success : function() {
										$.gritter.removeAll();
									}
								},
								url : function(params) {
									// ***UPDATE AVATAR HERE*** //
									//for a working upload example you can replace the contents of this function with 
									//examples/profile-avatar-update.js

									var deferred = new $.Deferred

									var value = $('#avatar').next().find(
											'input[type=hidden]:eq(0)').val();
									if (!value || value.length == 0) {
										deferred.resolve();
										return deferred.promise();
									}

									//dummy upload
									setTimeout(
											function() {
												if ("FileReader" in window) {
													//for browsers that have a thumbnail of selected image
													var thumb = $('#avatar')
															.next().find('img')
															.data('thumb');
													if (thumb)
														$('#avatar').get(0).src = thumb;
												}

												deferred.resolve({
													'status' : 'OK'
												});

												if (last_gritter)
													$.gritter
															.remove(last_gritter);
												last_gritter = $.gritter
														.add({
															title : 'Avatar Updated!',
															text : 'Uploading to server can be easily implemented. A working example is included with the template.',
															class_name : 'gritter-info gritter-center'
														});

											},
											parseInt(Math.random() * 800 + 800))

									return deferred.promise();

									// ***END OF UPDATE AVATAR HERE*** //
								},

								success : function(response, newValue) {
								}
							})
		} catch (e) {
		}

		/**
		//let's display edit mode by default?
		var blank_image = true;//somehow you determine if image is initially blank or not, or you just want to display file input at first
		if(blank_image) {
			$('#avatar').editable('show').on('hidden', function(e, reason) {
				if(reason == 'onblur') {
					$('#avatar').editable('show');
					return;
				}
				$('#avatar').off('hidden');
			})
		}
		 */

		//////////////////////////////
		$('#profile-feed-1').ace_scroll({
			height : '250px',
			mouseWheelLock : true,
			alwaysVisible : true
		});

		$('a[ data-original-title]').tooltip();

		$('.easy-pie-chart.percentage').each(function() {
			var barColor = $(this).data('color') || '#555';
			var trackColor = '#E2E2E2';
			var size = parseInt($(this).data('size')) || 72;
			$(this).easyPieChart({
				barColor : barColor,
				trackColor : trackColor,
				scaleColor : false,
				lineCap : 'butt',
				lineWidth : parseInt(size / 10),
				animate : false,
				size : size
			}).css('color', barColor);
		});

		/////////////////////////////////////
		$(document).one('ajaxloadstart.page', function(e) {
			//in ajax mode, remove remaining elements before leaving page
			try {
				$('.editable').editable('destroy');
			} catch (e) {
			}
			$('[class*=select2]').remove();
		});
	});
</script>
<%
	}
%>
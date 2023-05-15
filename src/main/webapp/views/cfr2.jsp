<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col-sm-8 text-left">
    <div class = "container">
        <div class = "row-content">
            <h2 style = "text-align: center; margin-bottom : 10px">CFR2</h2>
            <h2>${result.emotion}</h2>
            <h2>${result.gender}</h2>
            <h2>${result.pose}</h2>
            <h2>${result.age}</h2>

            <form action = "/cfr2impl" method = "post" enctype="multipart/form-data" id = "cfr2_form" class="form-horizontal">
                <div class="form-group">
                    <label class="control-label col-sm-2" for="img">Image:</label>
                    <div class="col-sm-8">
                        <input type="file" class="form-control" id="img" placeholder="Input img" name="img">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type = "submit" id = "cfr2_btn" class="btn btn-warning">cfr2 BUTTON</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>


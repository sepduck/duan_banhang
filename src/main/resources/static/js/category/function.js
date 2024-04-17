$(document).ready(function (){
    getList()
    findById()
})
function findById(){
    let id = $('#categoryId').val();
    if (id > 0){
        $.ajax({
            method: 'get',
            url: 'http://localhost:8080/category/findById?categoryId='+ id,
            contentType: 'application/json',
            success: function (json){
                $('#categoryName').val(json.data.categoryName);
                $('#description').val(json.data.description);
            }
        })
    }
}
function save(){
    let id = $('#categoryId').val()
    let name = $('#categoryName').val()
    let description = $('#description').val()
    let data = {
        categoryId : id,
        categoryName : name,
        description: description
    }
    $.ajax({
        method: 'post',
        url: 'http://localhost:8080/category/save',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (json){
            window.location.href= 'http://localhost:8080/ducnhungshop/category/list'
        }
    })
}
function getList(){
    $.ajax({
        method: 'get',
        url: 'http://localhost:8080/category/list',
        contentType:'application/json',
        success: function (json){
            list(json.data)
        }
    })
}
function list(data){
    let body = $('#viewCategory');
    body.empty();
    let str = '';
    for (let i = 0; i < data.length; i++) {
        str += '<tr>'
        str += '<th>' + data[i].categoryId + '</th>'
        str += '<th>' + data[i].categoryName + '</th>'
        str += '<th>' + data[i].description + '</th>'
        str += '<th><a class="btn btn-success" href="http://localhost:8080/ducnhungshop/category/save/'+data[i].categoryId+'">Edit</a>' +
            '<a class="btn btn-danger" href="http://localhost:8080/ducnhungshop/category/delete/'+data[i].categoryId+'">Delete</a></th>'
        str += '</tr>'
    }
    body.append(str);
}

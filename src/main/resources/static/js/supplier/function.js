$(document).ready(function (){
    getList()
})
function getList(){
    $.ajax({
        method: 'get',
        url: 'http://localhost:8080/suppliers/list',
        contentType: 'application/json',
        success: function (json){
            view(json.data)
        }
    })
}
function view(data){
    let body = $('#viewSupplier');
    body.empty();
    let str = '';
    for (let i = 0; i < data.length; i++) {
        str += '<tr>'
        str += '<th>' + data[i].supplierId + '</th>'
        str += '<th>' + data[i].companyName + '</th>'
        str += '<th>' + data[i].contactTitle + '</th>'
        str += '<th>' + data[i].contactName + '</th>'
        str += '<th>' + data[i].province + '</th>'
        str += '<th>' + data[i].city + '</th>'
        str += '<th>' + data[i].region + '</th>'
        str += '<th>' + data[i].postalCode + '</th>'
        str += '<th>' + data[i].country + '</th>'
        str += '<th>' + data[i].phone + '</th>'
        str += '<th>' + data[i].fax + '</th>'
        str += '<th>' + data[i].homePage + '</th>'
        str += '<th><a href="http://localhost:8080/ducnhungshop/supplier/save">Edit</a></th>'
    }
}
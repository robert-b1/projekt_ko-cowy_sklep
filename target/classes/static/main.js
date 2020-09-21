/**
 *
 */

$('document').ready(function () {

    $('.table .btn-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (author, status) {
            $('#editId').val(author.id);
            $('#editName').val(author.name);
        });

        $('#editAuthorModal').modal();

    });

    $('.table #deleteButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteAuthorModal #delRef').attr('href', href);
        $('#deleteAuthorModal').modal();

    });

});
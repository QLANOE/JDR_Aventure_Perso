$('input').change(function(){
    alert('Cliqué !');
});

$('input2').change(function(){
    alert('Cliqué !');
});

$(document).ready(function() {
    $("#add").click(function() {
        var lastField = $("#buildyourform div:last");
        var intId = (lastField && lastField.length && lastField.data("idx") + 1) || 1;
        var fieldWrapper = $("<div class=\"fieldwrapper\" id=\"field" + intId + "\"/>");
        fieldWrapper.data("idx", intId);
        var inputNiveau = $("<input type=\"text\" class=\"fieldname\" name=\"compétence["+intId+"].niveau\" />");
        var inputDescription = $("<input type=\"text\" class=\"fieldname\" name=\"compétence["+intId+"].description\" />");
        var removeButton = $("<input type=\"button\" class=\"remove\" value=\"-\" />");
        removeButton.click(function() {
            $(this).parent().remove();
        });
        fieldWrapper.append(inputNiveau);
        fieldWrapper.append(inputDescription);
        fieldWrapper.append(removeButton)
        $("#buildyourform").append(fieldWrapper);
    });


});
let elems = document.body.getElementsByTagName("*");
let replacements = conversions.replacements;
for (let replacement of replacements) {
    let trigger = RegExp(replacement[0],"gi");
    let new_str;
    if(typeof(replacement[1]) === "string"){
        new_str = replacement[1];
    } else {
        new_str = replacement[1][Math.floor(Math.random()*replacement[1].length)];
    }
    for (let ele of elems) {
        let should_revert = false;
        let replacer = findAndReplaceDOMText(ele, {
            find: trigger,
            replace: function(portion, match) {
                if (portion.text.match(trigger)){
                    el = document.createElement('span');
                    el.title = "original: " + portion.text;
                    el.innerHTML="";
                    bold = document.createElement("B");
                    bold.innerHTML = new_str;
                    el.appendChild(bold);
                    return el;
                } else {
                    should_revert = true;
                }
            }
        });
        if(should_revert){
            replacer.revert();
        }
    }
}

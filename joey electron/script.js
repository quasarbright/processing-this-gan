paragraphs = document.getElementsByTagName('p');
for(let para of paragraphs){
    para.innerHTML = para.innerHTML.replace(/electron/g,'<b>joey electron</b>');
    para.innerHTML = para.innerHTML.replace(/Electron/g,'<b>Joey Electron</b>');
}

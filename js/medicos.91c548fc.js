(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["medicos"],{"0a49":function(t,e,n){var r=n("9b43"),a=n("626a"),s=n("4bf8"),o=n("9def"),i=n("cd1c");t.exports=function(t,e){var n=1==t,c=2==t,l=3==t,u=4==t,d=6==t,f=5==t||d,m=e||i;return function(e,i,p){for(var b,v,y=s(e),h=a(y),g=r(i,p,3),k=o(h.length),C=0,w=n?m(e,k):c?m(e,0):void 0;k>C;C++)if((f||C in h)&&(b=h[C],v=g(b,C,y),t))if(n)w[C]=v;else if(v)switch(t){case 3:return!0;case 5:return b;case 6:return C;case 2:w.push(b)}else if(u)return!1;return d?-1:l||u?u:w}}},1169:function(t,e,n){var r=n("2d95");t.exports=Array.isArray||function(t){return"Array"==r(t)}},1731:function(t,e,n){"use strict";var r=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("b-nav",{staticClass:"bg-light",attrs:{tabs:""}},[n("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"medicos"}}},[t._v("Todos los Registros")]),n("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"nuevoMedico"}}},[t._v("Registrar")])],1)},a=[],s={name:"navMedic"},o=s,i=n("2877"),c=Object(i["a"])(o,r,a,!1,null,null,null);e["a"]=c.exports},"1e6b":function(t,e,n){"use strict";n.r(e);var r=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("navMedic"),n("div",{staticClass:"container fluid bg-light"},[n("b-modal",{ref:"myModalRef",attrs:{id:"modal-medic","hide-footer":"",title:"Eliminar Médico"}},[n("div",{staticClass:"container"},[n("div",{staticClass:"row"},[n("p",[t._v("¿Está seguro que desea eliminar al médico?")]),n("div",{staticClass:"col-md-6 pl-0"},[n("a",{staticClass:"btn btn-secondary btn-sm btn-block",attrs:{href:"#"},on:{click:function(e){return t.deleteById(t.selectedID)}}},[t._v("Confirmar")])]),n("div",{staticClass:"col-md-6 pr-0"},[n("a",{staticClass:"btn btn-tertiary btn-sm btn-block",attrs:{href:"#"},on:{click:function(e){return t.$refs.myModalRef.hide()}}},[t._v("Cancelar")])])])])]),t._m(0),n("b-row",{staticClass:"p-5"},[n("b-col",{staticClass:"my-1",attrs:{md:"6"}},[n("b-form-group",{staticClass:"mb-0",attrs:{"label-cols-sm":"3",label:"Buscar"}},[n("b-input-group",[n("b-form-input",{attrs:{placeholder:"Escriba para buscar"},model:{value:t.filter,callback:function(e){t.filter=e},expression:"filter"}}),n("b-input-group-append",[n("b-button",{attrs:{disable:!t.filter},on:{click:function(e){t.filter=""}}},[t._v("Limpiar")])],1)],1)],1)],1),n("b-col",{staticClass:"my-1",attrs:{md:"6"}},[n("b-form-group",{staticClass:"mb-0",attrs:{"label-cols-sm":"3",label:"Ordenar por"}},[n("b-input-group",[n("b-form-select",{attrs:{options:t.sortOptions},model:{value:t.sortBy,callback:function(e){t.sortBy=e},expression:"sortBy"}},[n("option",{attrs:{slot:"first"},domProps:{value:null},slot:"first"},[t._v("-- Seleccione --")])]),n("b-form-select",{attrs:{slot:"append",disabled:!t.sortBy},slot:"append",model:{value:t.sortDesc,callback:function(e){t.sortDesc=e},expression:"sortDesc"}},[n("option",{domProps:{value:!1}},[t._v("Asc")]),n("option",{domProps:{value:!0}},[t._v("Desc")])])],1)],1)],1)],1),n("b-table",{attrs:{id:"table-medic","show-empty":"",hover:"",small:"",stacked:"xl",fixed:"","empty-filtered-text":"No se encontrarón registros en su búsqueda","empty-text":"No hay datos para mostrar",items:t.medics,fields:t.columns,filter:t.filter,"current-page":t.currentPage,"per-page":10,"sort-by":t.sortBy,"sort-desc":t.sortDesc,"sort-direction":t.sortDirection},on:{"update:sortBy":function(e){t.sortBy=e},"update:sort-by":function(e){t.sortBy=e},"update:sortDesc":function(e){t.sortDesc=e},"update:sort-desc":function(e){t.sortDesc=e},filtered:t.onFiltered},scopedSlots:t._u([{key:"nombres",fn:function(e){return[t._v("\n        "+t._s(e.item.nombre)+" "+t._s(e.item.apellido)+"\n      ")]}},{key:"patient",fn:function(e){return[e.item.pacientes.length>0?n("router-link",{staticClass:"btn btn-success",attrs:{to:"medico/"+e.item.id+"/pacientes"}},[n("i",{staticClass:"fa fa-user-injured"}),t._v(" Ver\n        ")]):t._e()]}},{key:"internment",fn:function(e){return[e.item.internaciones.length>0?n("router-link",{staticClass:"btn btn-success",attrs:{to:"medico/"+e.item.id+"/internaciones"}},[n("i",{staticClass:"fa fa-procedures"}),t._v(" Ver\n        ")]):t._e()]}},{key:"actions",fn:function(e){return[n("router-link",{staticClass:"btn btn-warning mb-1 mr-1",attrs:{to:"/medico/"+e.item.id+"/editar"}},[n("i",{staticClass:"fa fa-user-edit"})]),n("button",{staticClass:"btn btn-danger mb-1",attrs:{type:"button"},on:{click:function(n){return t.getId(e.item.id)}}},[n("i",{staticClass:"fa fa-trash-alt"})])]}}])}),n("b-row",{staticClass:"p-5"},[n("b-col",{staticClass:"my-1",attrs:{md:"6"}},[n("b-pagination",{attrs:{size:"md","total-rows":t.totalRows,"per-page":10},on:{input:function(e){return t.find(t.currentPage)}},model:{value:t.currentPage,callback:function(e){t.currentPage=e},expression:"currentPage"}})],1)],1)],1),n("Footer")],1)},a=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("h1",{staticClass:"p-5 text-dark text-center"},[n("b",[t._v("Listado de Medicos")])])}],s=(n("7514"),n("96cf"),n("3b8d")),o=n("7eac"),i=n("1731"),c=n("bc3a"),l=n.n(c),u=n("fd2d"),d={name:"medicos",data:function(){return{columns:[{key:"numDocumento",label:"Numero Documento"},{key:"numMatricula",label:"Numero Matricula"},{key:"nombres",label:"Nombres",sortable:!0,sortDirection:"desc"},{key:"especialidad",label:"Especialidad",sortable:!0,sortDirection:"desc"},{key:"numTelefono",label:"Telefono"},{key:"numCelular",label:"Celular"},{key:"patient",label:"Pacientes"},{key:"internment",label:"Internaciones"},{key:"actions",label:"Acciones"}],medics:[],medic:[],sortBy:null,sortDesc:!1,sortDirection:"asc",filter:null,selectedID:null,totalRows:null,currentPage:1}},methods:{find:function(){var t=Object(s["a"])(regeneratorRuntime.mark(function t(e){var n=this;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:l.a.get("".concat(o["a"],"/api/medico?page=").concat(e-1)).then(function(t){n.medic=t.data.content,n.totalRows=t.data.totalElements}).catch(function(t){return console.log(t)});case 1:case"end":return t.stop()}},t)}));function e(e){return t.apply(this,arguments)}return e}(),findAll:function(){var t=Object(s["a"])(regeneratorRuntime.mark(function t(){var e=this;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:l.a.get("".concat(o["a"],"/api/medicos")).then(function(t){return e.medics=t.data}).catch(function(t){return console.log(t)});case 1:case"end":return t.stop()}},t)}));function e(){return t.apply(this,arguments)}return e}(),deleteById:function(t){var e=this;l.a.delete("".concat(o["a"],"/api/medico/").concat(t)).then(function(n){e.$refs.myModalRef.hide(),e.medics=e.medics.filter(function(e){return e.id!=t}),o["b"].alert({title:"Eliminado Correctamente",message:n.data.mensaje,backdrop:!0,locale:"es"})}).catch(function(t){e.$refs.myModalRef.hide(),o["b"].alert({title:"Error",message:t.response.data.mensaje,locale:"es",backdrop:!0}),console.log("Error: "+t.response.status+" Not Found")})},getId:function(t){this.selectedID=t,this.$refs.myModalRef.show()},onFiltered:function(t){this.totalRows=t.length,this.currentPage=1}},computed:{sortOptions:function(){return this.columns.filter(function(t){return t.sortable}).map(function(t){return{text:t.label,value:t.key}})}},mounted:function(t){this.find(t),this.findAll()},components:{navMedic:i["a"],Footer:u["a"]}},f=d,m=n("2877"),p=Object(m["a"])(f,r,a,!1,null,null,null);e["default"]=p.exports},7514:function(t,e,n){"use strict";var r=n("5ca1"),a=n("0a49")(5),s="find",o=!0;s in[]&&Array(1)[s](function(){o=!1}),r(r.P+r.F*o,"Array",{find:function(t){return a(this,t,arguments.length>1?arguments[1]:void 0)}}),n("9c6c")(s)},cd1c:function(t,e,n){var r=n("e853");t.exports=function(t,e){return new(r(t))(e)}},e853:function(t,e,n){var r=n("d3f4"),a=n("1169"),s=n("2b4c")("species");t.exports=function(t){var e;return a(t)&&(e=t.constructor,"function"!=typeof e||e!==Array&&!a(e.prototype)||(e=void 0),r(e)&&(e=e[s],null===e&&(e=void 0))),void 0===e?Array:e}}}]);
//# sourceMappingURL=medicos.91c548fc.js.map
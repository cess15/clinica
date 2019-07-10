(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["nuevoMedico"],{"036e":function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("navMedic"),a("div",{staticClass:"container bg-light"},[e._m(0),e._m(1),a("div",{staticStyle:{width:"400px"}},[null!==e.isCorrect?a("b-alert",{staticStyle:{width:"400px"},attrs:{show:"",variant:"danger"}},[a("h4",{staticClass:"alert-heading"},[e._v(e._s(e.avise))]),a("p",[e._v(e._s(e.message))])]):e._e()],1),a("form",{on:{submit:e.save}},[a("div",{staticClass:"form-row p-5"},[a("div",{staticClass:"col-md-4"},[a("label",{attrs:{for:"tipoDocumento"}},[e._v("Tipo de Documento")]),a("select",{directives:[{name:"model",rawName:"v-model.number",value:e.tipoDocumento.id,expression:"tipoDocumento.id",modifiers:{number:!0}}],staticClass:"form-control",attrs:{id:"tipoDocumento",required:""},on:{change:function(t){var a=Array.prototype.filter.call(t.target.options,function(e){return e.selected}).map(function(t){var a="_value"in t?t._value:t.value;return e._n(a)});e.$set(e.tipoDocumento,"id",t.target.multiple?a:a[0])}}},[a("option",{attrs:{disabled:"",value:""}},[e._v("--Seleccione--")]),a("option",{attrs:{value:"1"}},[e._v("Pasaporte")]),a("option",{attrs:{value:"2"}},[e._v("Cedula")])])]),a("div",{staticClass:"col-md-4"},[a("label",{attrs:{for:"numDocumento"}},[e._v("Numero de Documento")]),a("input",{directives:[{name:"model",rawName:"v-model",value:e.numDocumento,expression:"numDocumento"}],staticClass:"form-control",attrs:{placeholder:"Numero de documento",maxlength:"10",type:"text",required:""},domProps:{value:e.numDocumento},on:{input:function(t){t.target.composing||(e.numDocumento=t.target.value)}}})]),a("div",{staticClass:"col-md-4"},[a("label",{attrs:{for:"numDocumento"}},[e._v("Numero de Matricula")]),a("input",{directives:[{name:"model",rawName:"v-model",value:e.numMatricula,expression:"numMatricula"}],staticClass:"form-control",attrs:{placeholder:"Numero de documento",type:"text",required:""},domProps:{value:e.numMatricula},on:{input:function(t){t.target.composing||(e.numMatricula=t.target.value)}}})])]),a("div",{staticClass:"form-row p-5"},[a("div",{staticClass:"col-md-6"},[a("label",{attrs:{for:"nombre"}},[e._v("Nombres")]),a("input",{directives:[{name:"model",rawName:"v-model",value:e.nombre,expression:"nombre"}],staticClass:"form-control",attrs:{placeholder:"Ingrese nombres",type:"text",required:""},domProps:{value:e.nombre},on:{input:function(t){t.target.composing||(e.nombre=t.target.value)}}})]),a("div",{staticClass:"col-md-6 mb-3"},[a("label",{attrs:{for:"nombre"}},[e._v("Apellidos")]),a("input",{directives:[{name:"model",rawName:"v-model",value:e.apellido,expression:"apellido"}],staticClass:"form-control",attrs:{placeholder:"Ingrese apellidos",type:"text",required:""},domProps:{value:e.apellido},on:{input:function(t){t.target.composing||(e.apellido=t.target.value)}}})])]),a("div",{staticClass:"form-row p-5"},[a("div",{staticClass:"col-md-6"},[a("label",{attrs:{for:"numTelefono"}},[e._v("Numero Telefono")]),a("input",{directives:[{name:"model",rawName:"v-model",value:e.numTelefono,expression:"numTelefono"}],staticClass:"form-control",attrs:{placeholder:"Numero de telefono",type:"text",maxlength:"10"},domProps:{value:e.numTelefono},on:{input:function(t){t.target.composing||(e.numTelefono=t.target.value)}}})]),a("div",{staticClass:"col-md-6"},[a("label",{attrs:{for:"numTelefono"}},[e._v("Numero Celular")]),a("input",{directives:[{name:"model",rawName:"v-model",value:e.numCelular,expression:"numCelular"}],staticClass:"form-control",attrs:{placeholder:"Numero de celular",maxlength:"10",type:"text",required:""},domProps:{value:e.numCelular},on:{input:function(t){t.target.composing||(e.numCelular=t.target.value)}}})])]),a("div",{staticClass:"form-row p-5"},[a("div",{staticClass:"col-md-12"},[a("label",{attrs:{for:"especialidad"}},[e._v("Especialidad")]),a("input",{directives:[{name:"model",rawName:"v-model",value:e.especialidad,expression:"especialidad"}],staticClass:"form-control",attrs:{placeholder:"Especialidad",type:"text",required:""},domProps:{value:e.especialidad},on:{input:function(t){t.target.composing||(e.especialidad=t.target.value)}}})])]),e._m(2)])]),a("Footer")],1)},l=[function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("h1",{staticClass:"text-center text-dark p-5"},[a("b",[e._v("Registro del Médico")])])},function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("h5",{staticClass:"text-center text-dark"},[a("b",[e._v("Llene el siguiente formulario")])])},function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"form-row p-5"},[a("button",{staticClass:"btn btn-primary"},[e._v("Registrar")])])}],n=a("7eac"),r=a("bc3a"),s=a.n(r),i=a("1731"),u=a("fd2d"),c={name:"nuevoMedico",data:function(){return{tipoDocumento:{id:null},numMatricula:null,apellido:null,nombre:null,numDocumento:null,especialidad:null,numTelefono:null,numCelular:null,message:null,avise:null,isCorrect:null}},methods:{save:function(e){var t=this;e.preventDefault(),this.avise="",this.message="",s.a.post("".concat(n["a"],"/api/medico"),{tipoDocumento:this.tipoDocumento,numMatricula:this.numMatricula,apellido:this.apellido,nombre:this.nombre,numDocumento:this.numDocumento,especialidad:this.especialidad,numTelefono:this.numTelefono,numCelular:this.numCelular}).then(function(e){t.tipoDocumento={},t.numMatricula=null,t.apellido=null,t.nombre=null,t.numDocumento=null,t.especialidad=null,t.numTelefono=null,t.numCelular=null,n["b"].alert({title:"Datos Guardados",message:e.data.mensaje,locale:"es",backdrop:!0,callback:t.$router.push("/medicos")})}).catch(function(e){t.avise="Error",t.isCorrect=!1,t.message="Detalle: "+e.response.data.mensaje,n["b"].alert({title:"Error",message:"No se pudo registrar",locale:"es",backdrop:!0}),console.log("Error "+e.response.status+" Conflict")})}},components:{navMedic:i["a"],Footer:u["a"]}},m=c,d=a("2877"),p=Object(d["a"])(m,o,l,!1,null,null,null);t["default"]=p.exports},1731:function(e,t,a){"use strict";var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("b-nav",{staticClass:"bg-light",attrs:{tabs:""}},[a("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"medicos"}}},[e._v("Todos los Registros")]),a("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"nuevoMedico"}}},[e._v("Registrar")])],1)},l=[],n={name:"navMedic"},r=n,s=a("2877"),i=Object(s["a"])(r,o,l,!1,null,null,null);t["a"]=i.exports}}]);
//# sourceMappingURL=nuevoMedico.dc558039.js.map
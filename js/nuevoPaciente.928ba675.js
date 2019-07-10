(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["nuevoPaciente"],{"9ead":function(e,t,o){"use strict";var a=function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("b-nav",{staticClass:"bg-light",attrs:{tabs:""}},[o("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"pacientes"}}},[e._v("Todos los Registros")]),o("b-nav-item",{attrs:{"exact-active-class":"active",to:{name:"nuevoPaciente"}}},[e._v("Registrar")])],1)},i=[],l={name:"navPatient"},r=l,n=o("2877"),s=Object(n["a"])(r,a,i,!1,null,null,null);t["a"]=s.exports},b3d7:function(e,t,o){"use strict";o.r(t);var a=function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",[o("navPatient"),o("div",{staticClass:"container bg-light"},[e._m(0),e._m(1),o("div",{staticStyle:{width:"400px"}},[null!==e.isCorrect?o("b-alert",{staticStyle:{width:"400px"},attrs:{show:"",variant:"danger"}},[o("h4",{staticClass:"alert-heading"},[e._v(e._s(e.avise))]),o("p",[e._v(e._s(e.message))])]):e._e()],1),o("form",{on:{submit:e.save}},[o("div",{staticClass:"form-row p-5"},[o("div",{staticClass:"col-md-6"},[o("label",{attrs:{for:"nombre"}},[e._v("Nombres")]),o("input",{directives:[{name:"model",rawName:"v-model",value:e.nombre,expression:"nombre"}],staticClass:"form-control",attrs:{placeholder:"Ingrese nombres",type:"text",required:""},domProps:{value:e.nombre},on:{input:function(t){t.target.composing||(e.nombre=t.target.value)}}})]),o("div",{staticClass:"col-md-6"},[o("label",{attrs:{for:"nombre"}},[e._v("Apellidos")]),o("input",{directives:[{name:"model",rawName:"v-model",value:e.apellido,expression:"apellido"}],staticClass:"form-control",attrs:{placeholder:"Ingrese apellidos",type:"text",required:""},domProps:{value:e.apellido},on:{input:function(t){t.target.composing||(e.apellido=t.target.value)}}})])]),o("div",{staticClass:"form-row p-5"},[o("div",{staticClass:"col-md-6"},[o("label",{attrs:{for:"tipoDocumento"}},[e._v("Tipo de Documento")]),o("select",{directives:[{name:"model",rawName:"v-model.number",value:e.tipoDocumento.id,expression:"tipoDocumento.id",modifiers:{number:!0}}],staticClass:"form-control",attrs:{id:"tipoDocumento",required:""},on:{change:function(t){var o=Array.prototype.filter.call(t.target.options,function(e){return e.selected}).map(function(t){var o="_value"in t?t._value:t.value;return e._n(o)});e.$set(e.tipoDocumento,"id",t.target.multiple?o:o[0])}}},[o("option",{attrs:{disabled:"",value:""}},[e._v("--Seleccione--")]),o("option",{attrs:{value:"1"}},[e._v("Pasaporte")]),o("option",{attrs:{value:"2"}},[e._v("Cedula")])])]),o("div",{staticClass:"col-md-6"},[o("label",{attrs:{for:"numDocumento"}},[e._v("Numero de Documento")]),o("input",{directives:[{name:"model",rawName:"v-model",value:e.numDocumento,expression:"numDocumento"}],staticClass:"form-control",attrs:{placeholder:"Numero de documento",maxlength:"10",type:"text",required:""},domProps:{value:e.numDocumento},on:{input:function(t){t.target.composing||(e.numDocumento=t.target.value)}}})])]),o("div",{staticClass:"form-row p-5"},[o("div",{staticClass:"col-md-6"},[o("label",{attrs:{for:"domicilio"}},[e._v("Domicilio")]),o("input",{directives:[{name:"model",rawName:"v-model",value:e.domicilio,expression:"domicilio"}],staticClass:"form-control",attrs:{placeholder:"Domicilio",type:"text",required:""},domProps:{value:e.domicilio},on:{input:function(t){t.target.composing||(e.domicilio=t.target.value)}}})]),o("div",{staticClass:"col-md-6"},[o("label",{attrs:{for:"obraSocial"}},[e._v("Obra Social")]),o("input",{directives:[{name:"model",rawName:"v-model",value:e.obraSocial,expression:"obraSocial"}],staticClass:"form-control",attrs:{placeholder:"Obra Social",type:"text",required:""},domProps:{value:e.obraSocial},on:{input:function(t){t.target.composing||(e.obraSocial=t.target.value)}}})])]),e._m(2)])]),o("Footer")],1)},i=[function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("h1",{staticClass:"text-center text-dark p-5"},[o("b",[e._v("Registro del Paciente")])])},function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("h5",{staticClass:"text-center text-dark"},[o("b",[e._v("Llene el siguiente formulario")])])},function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{staticClass:"form-row p-5"},[o("button",{staticClass:"btn btn-primary"},[e._v("Registrar")])])}],l=o("7eac"),r=o("bc3a"),n=o.n(r),s=o("9ead"),c=o("fd2d"),m={name:"nuevoPaciente",data:function(){return{tipoDocumento:{id:null},apellido:null,nombre:null,numDocumento:null,domicilio:null,obraSocial:null,message:null,isCorrect:null,avise:null,medics:[]}},methods:{save:function(e){var t=this;e.preventDefault(),this.avise="",this.message="",n.a.post(l["a"]+"/api/paciente",{tipoDocumento:this.tipoDocumento,apellido:this.apellido,nombre:this.nombre,numDocumento:this.numDocumento,domicilio:this.domicilio,obraSocial:this.obraSocial}).then(function(e){t.tipoDocumento={},t.apellido=null,t.nombre=null,t.numDocumento=null,t.domicilio=null,t.obraSocial=null,l["b"].alert({title:"Datos Guardados",message:e.data.mensaje,locale:"es",backdrop:!0,callback:t.$router.push("/pacientes")})}).catch(function(e){t.avise="Error",t.isCorrect=!1,t.message="Detalle: "+e.response.data.mensaje,l["b"].alert({title:"Error",message:"No se pudo registrar",locale:"es",backdrop:!0}),console.log("Error "+e.response.status+" Conflict")})}},components:{navPatient:s["a"],Footer:c["a"]}},u=m,d=o("2877"),p=Object(d["a"])(u,a,i,!1,null,null,null);t["default"]=p.exports}}]);
//# sourceMappingURL=nuevoPaciente.928ba675.js.map
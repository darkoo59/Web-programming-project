<template>
  <section class="vh-100 gradient-custom">
  <form>
    <div class="content">
      <div class="row">
        <div class="col-lg-4">
        </div>
        <div class="col-lg-4">
          <div class="form-group p-3">
            <label for="exampleInputEmail1">Username</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                   placeholder="Enter username">
          </div>
          <div class="form-group p-3">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
        <div class="col-lg-4">
          </div>
      </div>
    </div>
  </form>
  </section>
</template>

<script>

</script>

<style scoped>
label {
  color: white;
}
.gradient-custom {
  /* Chrome 10-25, Safari 5.1-6 */
  background: -webkit-linear-gradient(to bottom right, #000428, #004e92);

  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
  background: linear-gradient(to bottom right, #000428, #004e92);
}
</style>
package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Ear: ImageVector
    get() {
        if (_Ear != null) {
            return _Ear!!
        }
        _Ear = ImageVector.Builder(
            name = "Filled.Ear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.892f, 3.858f)
                curveTo(8.342f, 4.324f, 6f, 6.329f, 6f, 9.618f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -2.43f, 1.683f, -3.923f, 3.662f, -4.285f)
                curveToRelative(1.996f, -0.365f, 4.115f, 0.452f, 4.962f, 2.532f)
                curveToRelative(0.42f, 1.029f, 0.44f, 1.777f, 0.292f, 2.37f)
                curveToRelative(-0.153f, 0.61f, -0.508f, 1.148f, -1.003f, 1.721f)
                curveToRelative(-0.22f, 0.254f, -0.454f, 0.502f, -0.704f, 0.766f)
                lineToRelative(-0.1f, 0.106f)
                curveToRelative(-0.283f, 0.299f, -0.58f, 0.618f, -0.86f, 0.958f)
                curveToRelative(-0.56f, 0.685f, -1.074f, 1.493f, -1.292f, 2.518f)
                curveToRelative(-0.348f, 1.645f, -1.37f, 2.446f, -2.487f, 2.446f)
                curveToRelative(-0.53f, 0f, -0.915f, -0.22f, -1.189f, -0.588f)
                curveToRelative(-0.29f, -0.39f, -0.476f, -0.98f, -0.476f, -1.703f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                curveToRelative(0f, 0.958f, 0.244f, 1.888f, 0.772f, 2.598f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.97f, 20.25f)
                curveToRelative(1.996f, 0f, 3.498f, -1.479f, 3.955f, -3.635f)
                curveToRelative(0.148f, -0.7f, 0.505f, -1.291f, 0.985f, -1.878f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.888f, -0.983f)
                curveToRelative(0.247f, -0.262f, 0.507f, -0.536f, 0.75f, -0.818f)
                curveToRelative(0.554f, -0.641f, 1.085f, -1.39f, 1.323f, -2.335f)
                curveToRelative(0.241f, -0.962f, 0.157f, -2.038f, -0.358f, -3.302f)
                curveToRelative(-1.173f, -2.88f, -4.089f, -3.904f, -6.621f, -3.441f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.002f, 9.376f)
                curveToRelative(0.214f, 1.674f, -3.633f, 5.374f, -5.502f, 5.374f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                curveToRelative(0.173f, 0f, 0.455f, -0.129f, 0.8f, -0.432f)
                lineToRelative(0.083f, -0.088f)
                curveToRelative(0.146f, -0.194f, 0.188f, -0.487f, 0.06f, -0.777f)
                lineToRelative(-0.08f, -0.143f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, -0.36f)
                lineToRelative(-0.067f, -0.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.388f, -0.435f)
                curveToRelative(-0.304f, -0.376f, -0.67f, -0.96f, -0.508f, -1.722f)
                lineToRelative(0.082f, -0.321f)
                curveToRelative(0.47f, -1.552f, 1.783f, -2.295f, 3.086f, -2.172f)
                curveToRelative(1.284f, 0.122f, 2.466f, 1.077f, 2.734f, 2.646f)
            }
        }.build()

        return _Ear!!
    }

@Suppress("ObjectPropertyName")
private var _Ear: ImageVector? = null

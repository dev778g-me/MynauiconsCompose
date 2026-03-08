package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) {
            return _Sparkles!!
        }
        _Sparkles = ImageVector.Builder(
            name = "Filled.Sparkles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.195f, 2.845f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.467f, 0f)
                curveToRelative(-0.232f, 1.096f, -0.55f, 1.835f, -0.99f, 2.361f)
                curveToRelative(-0.429f, 0.516f, -1.029f, 0.893f, -1.95f, 1.166f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.438f)
                curveToRelative(0.885f, 0.262f, 1.48f, 0.617f, 1.916f, 1.125f)
                curveToRelative(0.444f, 0.516f, 0.782f, 1.26f, 1.024f, 2.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.467f, 0f)
                curveToRelative(0.242f, -1.143f, 0.58f, -1.886f, 1.024f, -2.402f)
                curveToRelative(0.436f, -0.508f, 1.03f, -0.863f, 1.917f, -1.125f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.438f)
                curveToRelative(-0.886f, -0.262f, -1.481f, -0.617f, -1.917f, -1.125f)
                curveToRelative(-0.444f, -0.516f, -0.782f, -1.26f, -1.024f, -2.402f)
                moveToRelative(8.303f, 3.251f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.458f, 0f)
                curveToRelative(-0.554f, 2.292f, -1.141f, 3.674f, -1.972f, 4.638f)
                curveToRelative(-0.82f, 0.952f, -1.947f, 1.576f, -3.77f, 2.192f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.421f)
                curveToRelative(1.904f, 0.643f, 3.046f, 1.322f, 3.852f, 2.292f)
                curveToRelative(0.819f, 0.986f, 1.362f, 2.355f, 1.89f, 4.537f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.458f, 0f)
                curveToRelative(0.554f, -2.291f, 1.142f, -3.673f, 1.972f, -4.637f)
                curveToRelative(0.82f, -0.952f, 1.947f, -1.576f, 3.77f, -2.192f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.421f)
                curveToRelative(-1.907f, -0.644f, -3.047f, -1.32f, -3.852f, -2.29f)
                curveToRelative(-0.818f, -0.984f, -1.36f, -2.352f, -1.89f, -4.54f)
            }
        }.build()

        return _Sparkles!!
    }

@Suppress("ObjectPropertyName")
private var _Sparkles: ImageVector? = null

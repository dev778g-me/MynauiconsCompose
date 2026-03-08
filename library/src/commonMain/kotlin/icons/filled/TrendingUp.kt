package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TrendingUp: ImageVector
    get() {
        if (_TrendingUp != null) {
            return _TrendingUp!!
        }
        _TrendingUp = ImageVector.Builder(
            name = "Filled.TrendingUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.287f, 14.693f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.75f, 14f)
                verticalLineTo(7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.673f, -0.746f)
                lineTo(20f, 6.25f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, 1.28f)
                lineToRelative(3f, 3.001f)
                lineToRelative(-1.849f, 1.88f)
                curveToRelative(-0.316f, 0.318f, -0.577f, 0.361f, -0.86f, 0.32f)
                curveToRelative(-0.365f, -0.054f, -0.764f, -0.25f, -1.317f, -0.526f)
                lineToRelative(-0.016f, -0.008f)
                curveToRelative(-0.492f, -0.245f, -1.13f, -0.562f, -1.8f, -0.632f)
                curveToRelative(-0.753f, -0.08f, -1.495f, 0.152f, -2.161f, 0.846f)
                lineToRelative(-4.001f, 4.063f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.068f, 1.052f)
                lineToRelative(4.001f, -4.063f)
                lineToRelative(0.01f, -0.009f)
                curveToRelative(0.354f, -0.372f, 0.644f, -0.427f, 0.927f, -0.397f)
                curveToRelative(0.36f, 0.037f, 0.76f, 0.22f, 1.303f, 0.49f)
                lineToRelative(0.084f, 0.043f)
                curveToRelative(0.47f, 0.235f, 1.069f, 0.534f, 1.684f, 0.625f)
                curveToRelative(0.734f, 0.108f, 1.48f, -0.079f, 2.146f, -0.751f)
                lineToRelative(1.842f, -1.872f)
                lineToRelative(2.939f, 2.938f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.817f, 0.163f)
            }
        }.build()

        return _TrendingUp!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingUp: ImageVector? = null

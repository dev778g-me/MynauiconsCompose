package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Share: ImageVector
    get() {
        if (_Share != null) {
            return _Share!!
        }
        _Share = ImageVector.Builder(
            name = "Filled.Share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8.75f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.002f, 5.81f)
                lineToRelative(0.068f, 0.054f)
                lineToRelative(4.73f, 3.312f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.617f, -1.4f)
                lineToRelative(-4.479f, -3.135f)
                curveToRelative(0.2f, -0.421f, 0.312f, -0.893f, 0.312f, -1.391f)
                reflectiveCurveToRelative(-0.112f, -0.97f, -0.312f, -1.391f)
                lineToRelative(4.48f, -3.136f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.617f, -1.4f)
                lineTo(9.07f, 9.387f)
                lineToRelative(-0.068f, 0.053f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 8.75f)
            }
        }.build()

        return _Share!!
    }

@Suppress("ObjectPropertyName")
private var _Share: ImageVector? = null

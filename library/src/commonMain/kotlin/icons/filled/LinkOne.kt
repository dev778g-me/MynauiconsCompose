package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LinkOne: ImageVector
    get() {
        if (_LinkOne != null) {
            return _LinkOne!!
        }
        _LinkOne = ImageVector.Builder(
            name = "Filled.LinkOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.468f, 4.532f)
                curveToRelative(-1.03f, -1.031f, -2.652f, -1.033f, -3.62f, -0.062f)
                lineToRelative(-4.382f, 4.384f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.594f, 0.063f, 3.626f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.061f, 1.06f)
                curveToRelative(-1.59f, -1.59f, -1.646f, -4.163f, -0.063f, -5.746f)
                lineToRelative(4.381f, -4.385f)
                curveToRelative(1.582f, -1.583f, 4.153f, -1.528f, 5.743f, 0.063f)
                reflectiveCurveToRelative(1.645f, 4.164f, 0.063f, 5.747f)
                lineToRelative(-3.803f, 3.806f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.062f, -1.06f)
                lineToRelative(3.804f, -3.807f)
                curveToRelative(0.97f, -0.97f, 0.968f, -2.594f, -0.063f, -3.626f)
                moveToRelative(-6.935f, 5.864f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                curveToRelative(1.592f, 1.591f, 1.646f, 4.164f, 0.064f, 5.747f)
                lineToRelative(-0.027f, 0.026f)
                lineToRelative(-0.035f, 0.037f)
                lineToRelative(-4.38f, 4.385f)
                curveToRelative(-1.583f, 1.583f, -4.154f, 1.528f, -5.744f, -0.063f)
                reflectiveCurveToRelative(-1.644f, -4.164f, -0.063f, -5.747f)
                lineToRelative(3.804f, -3.806f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 1.06f)
                lineTo(4.47f, 15.842f)
                curveToRelative(-0.97f, 0.97f, -0.968f, 2.594f, 0.063f, 3.626f)
                curveToRelative(1.03f, 1.031f, 2.652f, 1.033f, 3.621f, 0.062f)
                lineToRelative(4.38f, -4.384f)
                lineToRelative(0.028f, -0.026f)
                lineToRelative(0.035f, -0.037f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.594f, -0.063f, -3.626f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
            }
        }.build()

        return _LinkOne!!
    }

@Suppress("ObjectPropertyName")
private var _LinkOne: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Six: ImageVector
    get() {
        if (_Six != null) {
            return _Six!!
        }
        _Six = ImageVector.Builder(
            name = "Outline.Six",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.75f, 7f)
                horizontalLineTo(12.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.75f, 3.75f)
                verticalLineToRelative(3.125f)
                moveToRelative(0f, 0f)
                arcToRelative(3.125f, 3.125f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.25f, 0f)
                curveToRelative(0f, -1.726f, -1.4f, -2.5f, -3.125f, -2.5f)
                reflectiveCurveToRelative(-3.125f, 0.774f, -3.125f, 2.5f)
            }
        }.build()

        return _Six!!
    }

@Suppress("ObjectPropertyName")
private var _Six: ImageVector? = null

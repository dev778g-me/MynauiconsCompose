package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShuffleAlt: ImageVector
    get() {
        if (_ShuffleAlt != null) {
            return _ShuffleAlt!!
        }
        _ShuffleAlt = ImageVector.Builder(
            name = "Outline.ShuffleAlt",
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
                moveToRelative(19f, 16.765f)
                lineToRelative(2f, 2.117f)
                lineTo(19f, 21f)
                moveToRelative(0f, -18f)
                lineToRelative(2f, 2.118f)
                lineToRelative(-2f, 2.117f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 5.118f)
                horizontalLineToRelative(-3.15f)
                curveTo(14.62f, 5.118f, 12f, 8.199f, 12f, 12f)
                reflectiveCurveToRelative(2.62f, 6.882f, 5.85f, 6.882f)
                horizontalLineTo(21f)
                moveToRelative(-18f, 0f)
                horizontalLineToRelative(3.15f)
                curveTo(9.38f, 18.882f, 12f, 15.801f, 12f, 12f)
                reflectiveCurveTo(9.38f, 5.118f, 6.15f, 5.118f)
                horizontalLineTo(3f)
            }
        }.build()

        return _ShuffleAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleAlt: ImageVector? = null

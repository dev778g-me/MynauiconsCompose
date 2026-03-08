package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Api: ImageVector
    get() {
        if (_Api != null) {
            return _Api!!
        }
        _Api = ImageVector.Builder(
            name = "Outline.Api",
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
                moveTo(5.5f, 13f)
                lineTo(7f, 11.5f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.75f, 0.75f, -3.5f, 2f, -5.5f, 0f)
                reflectiveCurveToRelative(-0.75f, -4.75f, 0f, -5.5f)
                moveTo(3f, 21f)
                lineToRelative(2.5f, -2.5f)
                moveToRelative(13f, -7.5f)
                lineTo(17f, 12.5f)
                lineTo(11.5f, 7f)
                lineTo(13f, 5.5f)
                curveToRelative(0.75f, -0.75f, 3.5f, -2f, 5.5f, 0f)
                reflectiveCurveToRelative(0.75f, 4.75f, 0f, 5.5f)
                moveToRelative(-6f, -3f)
                lineToRelative(-2f, 2f)
                moveTo(21f, 3f)
                lineToRelative(-2.5f, 2.5f)
                moveToRelative(-2.5f, 6f)
                lineToRelative(-2f, 2f)
            }
        }.build()

        return _Api!!
    }

@Suppress("ObjectPropertyName")
private var _Api: ImageVector? = null

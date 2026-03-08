package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Heading6: ImageVector
    get() {
        if (_Heading6 != null) {
            return _Heading6!!
        }
        _Heading6 = ImageVector.Builder(
            name = "Outline.Heading6",
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
                moveTo(3.75f, 4.5f)
                verticalLineToRelative(15f)
                moveToRelative(9.5f, -15f)
                verticalLineToRelative(15f)
                moveTo(3.75f, 12f)
                horizontalLineToRelative(9.5f)
                moveTo(20f, 9.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.657f, 0f, -3f, 1.679f, -3f, 3.75f)
                verticalLineToRelative(3.125f)
                moveToRelative(0f, 0f)
                curveToRelative(0f, 1.726f, 1.12f, 3.125f, 2.5f, 3.125f)
                reflectiveCurveToRelative(2.5f, -1.4f, 2.5f, -3.125f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 0.774f, -2.5f, 2.5f)
            }
        }.build()

        return _Heading6!!
    }

@Suppress("ObjectPropertyName")
private var _Heading6: ImageVector? = null

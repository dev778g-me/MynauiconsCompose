package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Heading5: ImageVector
    get() {
        if (_Heading5 != null) {
            return _Heading5!!
        }
        _Heading5 = ImageVector.Builder(
            name = "Outline.Heading5",
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
                moveToRelative(7.25f, -2.5f)
                curveToRelative(-2f, 0.625f, -4.5f, 0f, -4.5f, 0f)
                verticalLineToRelative(3.566f)
                horizontalLineToRelative(2.778f)
                curveToRelative(1.227f, 0f, 2.222f, 1.064f, 2.222f, 2.377f)
                verticalLineToRelative(1.399f)
                curveToRelative(0f, 3.522f, -5f, 3.566f, -5f, 0f)
            }
        }.build()

        return _Heading5!!
    }

@Suppress("ObjectPropertyName")
private var _Heading5: ImageVector? = null

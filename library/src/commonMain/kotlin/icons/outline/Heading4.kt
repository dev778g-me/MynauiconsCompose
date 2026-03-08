package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Heading4: ImageVector
    get() {
        if (_Heading4 != null) {
            return _Heading4!!
        }
        _Heading4 = ImageVector.Builder(
            name = "Outline.Heading4",
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
                moveToRelative(5.833f, -2.5f)
                curveToRelative(-0.833f, 3.75f, -3.333f, 6.875f, -3.333f, 6.875f)
                horizontalLineToRelative(5f)
                moveTo(19.5f, 19.5f)
                verticalLineToRelative(-5f)
            }
        }.build()

        return _Heading4!!
    }

@Suppress("ObjectPropertyName")
private var _Heading4: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Heading3: ImageVector
    get() {
        if (_Heading3 != null) {
            return _Heading3!!
        }
        _Heading3 = ImageVector.Builder(
            name = "Outline.Heading3",
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
                moveTo(16f, 9.5f)
                horizontalLineToRelative(5f)
                lineToRelative(-3.5f, 4.507f)
                curveToRelative(2f, 0f, 3.5f, 1.001f, 3.5f, 3.004f)
                curveToRelative(0f, 2.744f, -3.408f, 3.206f, -5f, 1.452f)
            }
        }.build()

        return _Heading3!!
    }

@Suppress("ObjectPropertyName")
private var _Heading3: ImageVector? = null

package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Tent: ImageVector
    get() {
        if (_Tent != null) {
            return _Tent!!
        }
        _Tent = ImageVector.Builder(
            name = "Outline.Tent",
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
                moveTo(5f, 19.5f)
                verticalLineToRelative(-10f)
                curveToRelative(2.809f, -1.248f, 4.986f, -2.583f, 7f, -5f)
                curveToRelative(2.014f, 2.417f, 4.191f, 3.752f, 7f, 5f)
                verticalLineToRelative(10f)
                moveToRelative(-14f, 0f)
                horizontalLineTo(3f)
                moveToRelative(2f, 0f)
                horizontalLineToRelative(2.5f)
                moveToRelative(11.5f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(-2f, 0f)
                horizontalLineToRelative(-2.5f)
                moveToRelative(-9f, 0f)
                horizontalLineToRelative(9f)
                moveToRelative(-9f, 0f)
                curveToRelative(2.586f, -2.586f, 4.031f, -5.406f, 4.5f, -9f)
                curveToRelative(0.469f, 3.594f, 1.914f, 6.414f, 4.5f, 9f)
            }
        }.build()

        return _Tent!!
    }

@Suppress("ObjectPropertyName")
private var _Tent: ImageVector? = null

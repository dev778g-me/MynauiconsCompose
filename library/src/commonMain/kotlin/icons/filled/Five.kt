package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Five: ImageVector
    get() {
        if (_Five != null) {
            return _Five!!
        }
        _Five = ImageVector.Builder(
            name = "Filled.Five",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(5.625f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(2.066f)
                horizontalLineToRelative(2.723f)
                curveToRelative(1.834f, 0f, 3.527f, 1.295f, 3.527f, 3.127f)
                verticalLineToRelative(1.399f)
                curveToRelative(0f, 1.132f, -0.514f, 2.01f, -1.274f, 2.585f)
                curveToRelative(-0.739f, 0.56f, -1.687f, 0.82f, -2.598f, 0.823f)
                curveToRelative(-0.912f, 0.003f, -1.862f, -0.25f, -2.603f, -0.81f)
                curveTo(8.512f, 16.364f, 8f, 15.482f, 8f, 14.342f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                curveToRelative(0f, 0.643f, 0.27f, 1.092f, 0.678f, 1.401f)
                curveToRelative(0.43f, 0.325f, 1.043f, 0.51f, 1.694f, 0.507f)
                curveToRelative(0.651f, -0.002f, 1.266f, -0.19f, 1.699f, -0.518f)
                curveToRelative(0.412f, -0.313f, 0.679f, -0.76f, 0.679f, -1.39f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -0.793f, -0.794f, -1.626f, -2.027f, -1.626f)
                horizontalLineTo(8.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
            }
        }.build()

        return _Five!!
    }

@Suppress("ObjectPropertyName")
private var _Five: ImageVector? = null

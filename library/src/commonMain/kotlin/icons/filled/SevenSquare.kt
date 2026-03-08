package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SevenSquare: ImageVector
    get() {
        if (_SevenSquare != null) {
            return _SevenSquare!!
        }
        _SevenSquare = ImageVector.Builder(
            name = "Filled.SevenSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.367f, 2.25f)
                horizontalLineToRelative(5.266f)
                curveToRelative(1.092f, 0f, 1.958f, 0f, 2.655f, 0.057f)
                curveToRelative(0.714f, 0.058f, 1.317f, 0.18f, 1.869f, 0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.075f, 2.077f)
                curveToRelative(0.281f, 0.55f, 0.403f, 1.154f, 0.461f, 1.868f)
                curveToRelative(0.057f, 0.697f, 0.057f, 1.563f, 0.057f, 2.655f)
                verticalLineToRelative(5.266f)
                curveToRelative(0f, 1.092f, 0f, 1.958f, -0.057f, 2.655f)
                curveToRelative(-0.058f, 0.714f, -0.18f, 1.317f, -0.46f, 1.869f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, 2.075f)
                curveToRelative(-0.552f, 0.281f, -1.155f, 0.403f, -1.869f, 0.461f)
                curveToRelative(-0.697f, 0.057f, -1.563f, 0.057f, -2.655f, 0.057f)
                horizontalLineTo(9.367f)
                curveToRelative(-1.092f, 0f, -1.958f, 0f, -2.655f, -0.057f)
                curveToRelative(-0.714f, -0.058f, -1.317f, -0.18f, -1.868f, -0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, -2.076f)
                curveToRelative(-0.281f, -0.552f, -0.403f, -1.155f, -0.461f, -1.869f)
                curveToRelative(-0.057f, -0.697f, -0.057f, -1.563f, -0.057f, -2.655f)
                verticalLineTo(9.367f)
                curveToRelative(0f, -1.092f, 0f, -1.958f, 0.057f, -2.655f)
                curveToRelative(0.058f, -0.714f, 0.18f, -1.317f, 0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.077f, -2.076f)
                curveToRelative(0.55f, -0.281f, 1.154f, -0.403f, 1.868f, -0.461f)
                curveToRelative(0.697f, -0.057f, 1.563f, -0.057f, 2.655f, -0.057f)
                moveToRelative(0.565f, 5.022f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.364f, 1.456f)
                curveToRelative(1.116f, 0.279f, 2.46f, 0.272f, 3.479f, 0.208f)
                lineToRelative(0.084f, -0.005f)
                curveToRelative(-0.311f, 0.445f, -0.665f, 0.975f, -1.02f, 1.55f)
                curveToRelative(-0.511f, 0.832f, -1.032f, 1.774f, -1.427f, 2.712f)
                curveToRelative(-0.39f, 0.926f, -0.684f, 1.91f, -0.684f, 2.807f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.603f, 0.206f, -1.37f, 0.566f, -2.225f)
                curveToRelative(0.355f, -0.843f, 0.834f, -1.713f, 1.323f, -2.507f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.906f, -2.748f)
                lineToRelative(0.031f, -0.04f)
                lineToRelative(0.008f, -0.01f)
                lineToRelative(0.002f, -0.002f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, -1.208f)
                lineToRelative(-0.005f, 0.001f)
                lineToRelative(-0.022f, 0.004f)
                lineToRelative(-0.091f, 0.014f)
                quadToRelative(-0.123f, 0.018f, -0.351f, 0.047f)
                curveToRelative(-0.3f, 0.038f, -0.723f, 0.083f, -1.204f, 0.113f)
                curveToRelative(-0.981f, 0.061f, -2.137f, 0.054f, -3.021f, -0.167f)
            }
        }.build()

        return _SevenSquare!!
    }

@Suppress("ObjectPropertyName")
private var _SevenSquare: ImageVector? = null
